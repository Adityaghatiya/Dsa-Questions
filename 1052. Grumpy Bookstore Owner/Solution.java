class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
int unsatisfied=0;
        for(int i=0;i<minutes;i++)
        {
            unsatisfied+=customers[i]*grumpy[i];
        }
        int i=0;
        int j=minutes;
        int maxunsatisfied=unsatisfied;

        while(j<customers.length)
        {
            unsatisfied+=customers[j]*grumpy[i];
unsatisfied-=customers[i]*grumpy[j];
            maxunsatisfied=Math.max(unsatisfied,maxunsatisfied);
            i++;
            j++;
        }

        int total=maxunsatisfied;

        for(int k=0;k<customers.length;k++)
        {
          if(grumpy[k]==0)
          {
            total+=customers[k];
          }
        }
        return total;
    }
}
