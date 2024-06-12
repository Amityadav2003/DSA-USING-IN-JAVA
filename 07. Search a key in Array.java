
import java.util.*;
public class SortArray{
public static int LinearSearch(int number[],int key){
for(int i=0;i<number.length;i++){
if(number[i]==key){
return i;
}
}
return -1;
}
public static void main(String args[]){
int number[]={1,5,8,2,4,3,6,7};
int key=6;
int index= LinearSearch(number, key);
if(index==-1){
System.out.println("Not Found");
}
else{
System.out.println("Key  of Index is:"+index);
}
}
}
