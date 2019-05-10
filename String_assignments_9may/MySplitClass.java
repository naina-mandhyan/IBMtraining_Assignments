class MySplitClass{

public static void main(String[] args) {

MySplitClass spl= new MySplitClass();

 spl.MySplitFunc("this-is-split-program",'-');

}


void MySplitFunc(String str,char delimitor){

String[] newstr= new String[str.length()];

int count=0;

int newloc=0;

int len=0;

for(int i =0;i<str.length()-1;i++){

  if(str.charAt(i) == delimitor){

  len++;

  }

}

len+=1;

int[] loc= new int[len];

for(int i =0;i<str.length()-1;i++){

Character a= new Character(str.charAt(i));

if(a.equals(delimitor)){

  loc[count]=i;

  count++;

}

}

loc[count]=str.length();

for(int j=0;j<loc.length;j++){

  if(loc[j]==0){

    continue;

  }

newstr[j]=str.substring(newloc,loc[j]);

newloc=loc[j]+1;

}

System.out.println("Splitted string is:");

for(int l=0;l<newstr.length-1;l++){

if(newstr[l]==null){

continue;

}

else

  System.out.print( newstr[l] + ",");

}

}

}