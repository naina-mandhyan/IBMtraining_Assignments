package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.project.bean.UserDetails;

public class ManageAccounts implements ManageAccountsInterface {
	Connection dbCon;
	PreparedStatement state;
	
	public ManageAccounts(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountwallet", "root", "");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Some issues occured while connecting: " + e.getMessage());
		}
	}

	public Integer checkBalance(Integer accNo) {
		String fetchQry = "Select Balance From accountholderdetails where AccountNo = ?";
		try {
			this.state = this.dbCon.prepareStatement(fetchQry);
			this.state.setInt(1,accNo);
			ResultSet rs = this.state.executeQuery();
			rs.next(); 
			return(rs.getInt("Balance"));
					
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean doDeposit(Integer accNo, Integer addBal, String type) {
		Integer bal = this.checkBalance(accNo);
		String updateQry = "update accountholderdetails set Balance = ? where AccountNo = ?";
		try {
			this.state = this.dbCon.prepareStatement(updateQry);
			this.state.setInt(1, (bal+addBal));
			this.state.setInt(2, accNo);
			if(this.state.executeUpdate() > 0) {
				this.recordTransaction(accNo, type, addBal);
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	public boolean doWithdraw(Integer accNo, Integer subBal, String type) {
		Integer bal = this.checkBalance(accNo);
		String updateQry = "update accountholderdetails set Balance = ? where AccountNo = ?";
		try {
			this.state = this.dbCon.prepareStatement(updateQry);
			this.state.setInt(1, (bal-subBal));
			this.state.setInt(2, accNo);
			if(this.state.executeUpdate() > 0) {
				this.recordTransaction(accNo, type, subBal);
				return true;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	public boolean doTransfer(Integer accNo, Integer toAcc, Integer amt, String type) {
		Integer bal = this.checkBalance(accNo);
		
		if(this.doWithdraw(accNo,amt,type + "_to_account " + toAcc) && this.doDeposit(toAcc,amt,type + "_from_account " + accNo))
			return true;
		
		return false;
				
	}

	public Integer storeInDb(UserDetails user) {
		String insertQry = "insert into accountholderdetails(User_Name,MobileNo,Balance) values(?,?,?) ";
		try {
			this.state = this.dbCon.prepareStatement(insertQry);
			this.state.setString(1, user.getUserName());
			this.state.setLong(2, user.getPhoneNo());
			this.state.setInt(3, user.getBalance());
			if(this.state.executeUpdate() > 0) {
				String fetchAccNo = "select AccountNo from accountholderdetails where MobileNo = ?";
				try {
				this.state = this.dbCon.prepareStatement(fetchAccNo);
				this.state.setLong(1, user.getPhoneNo());
				ResultSet rs = this.state.executeQuery();
				rs.next();
				return(rs.getInt("AccountNo"));
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void recordTransaction(Integer accNo, String type, Integer amt) {
		String insertQry = "insert into transactiondetails(AccountNo,TransactionType,AmountTransfered) values(?,?,?)";
		try {
			this.state = this.dbCon.prepareStatement(insertQry);
			this.state.setInt(1, accNo);
			this.state.setString(2, type);
			this.state.setInt(3, amt);
			this.state.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public String viewTransactions(Integer accNo) {
		String fetchQry = "Select * From transactiondetails where AccountNo = ?";
		String result = "";
		try {
			this.state = this.dbCon.prepareStatement(fetchQry);
			this.state.setInt(1,accNo);
			ResultSet rs = this.state.executeQuery();
			while(rs.next()) {
				result += rs.getString("TransactionType") + " -- " + rs.getInt("AmountTransfered") + " -- " + rs.getTimestamp("Date_And_Time") + "\n";
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean getAccNo(Integer accNo) {
		String fetchQry = "select AccountNo from accountholderdetails";
		try {
			this.state = this.dbCon.prepareStatement(fetchQry);
			ResultSet rs = this.state.executeQuery();
			while(rs.next()) {
				if(rs.getInt("AccountNo") == accNo)
					return true;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean getMobNo(Long mobNo) {
		String fetchQry = "select MobileNo from accountholderdetails";
		try {
			this.state = this.dbCon.prepareStatement(fetchQry);
			ResultSet rs = this.state.executeQuery();
			while(rs.next()) {
				if(rs.getLong("MobileNo") == mobNo)
					return true;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
