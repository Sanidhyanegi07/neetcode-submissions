class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Integer cars[]=new Integer[position.length];
        for(int i=0;i<position.length;i++)
        {
            cars[i]=i;
        }
        Arrays.sort(cars,(a, b) -> Integer.compare(position[b],position[a]));
        int fleets=0;
        double time=0;
        for(int i : cars)
        {
            double CurrentTime=(double)(target-position[i])/speed[i];
            if(CurrentTime>time)
            {
                fleets++;
                time=CurrentTime;
            }
        }
        return fleets;
    }
}
