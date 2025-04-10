public class zZzSortyWorty{public static void main(String[]aRgs){

int[] xXx={5,3,1,4,2};sortEmMaybe(xXx);
System.out.print("S0rted:");
for(int P=0;P<xXx.length;P++)System.out.print(xXx[P]+" ");}

public static void sortEmMaybe(int[] tHiSOne){

for(int i=0;i<tHiSOne.length;i++){
for(int j=i+1;j<tHiSOne.length;j++)
{if(tHiSOne[i]<tHiSOne[j]){   // bug: should be >
int tmp= tHiSOne[i];tHiSOne[i]=tHiSOne[j];
tHiSOne[j]=tmp;}}   // also, no boundary checks, just vibes
}} 
