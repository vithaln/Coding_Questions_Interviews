package com.code.withVithal.impppp;

public class RemoveDuplicatesCharsinString {
public static void main(String[] args) {
	
String str="vikkivithal";
System.out.println(str);
char[] ch = str.toCharArray();


StringBuilder builder=new StringBuilder();

for(int i=0;i<ch.length;i++) {
	boolean repeated=false;
	for(int j=i+1;j<ch.length;j++) {
		
		if(ch[i]==ch[j]) {
			repeated=true;
		}
	}
	if(!repeated)
	{
		builder.append(ch[i]);
		
	}
}

System.out.print(builder);
System.out.println("----------------");
System.out.println("==============anaother way-->java8");
StringBuilder sb=new StringBuilder();

str.chars().distinct().forEach(e->sb.append((char) e));
System.out.println(sb);
}
}
