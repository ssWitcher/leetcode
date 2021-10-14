import java.util.*;  
class Solution {
    public int reverse(int x) {
        long ans = 0;
        int flag = 0;
        if(x == Integer.MIN_VALUE ){
            return 0;
        }
        if(x < 0 ){
            flag = 1;
            x = -x;
        }
        ArrayList<String> num = new ArrayList<>();
        do{
            int tmp = x%10;
            int nextNumber = (int) x/10;
            x = nextNumber;
            num.add(Integer.toString(tmp));
        }while(x > 0);
        String number = String.join("",num);
       
        ans = Long.valueOf(number);
                  
        if(flag == 1){
            ans = -ans;
        }
        if(ans < Integer.MIN_VALUE){
            return 0;
        }else if(ans > Integer.MAX_VALUE){
            return 0;
        }else{
            return (int) ans;
        }
    }        
}