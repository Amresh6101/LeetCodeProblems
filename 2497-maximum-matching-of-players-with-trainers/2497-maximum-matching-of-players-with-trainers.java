class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);


        int i=0,j=0;


        int m=players.length;
        int n=trainers.length;
        int count=0;

        while(i<m && j<n){
            int playerAbility=players[i];
            int trainerCapacity=trainers[j];

            if(playerAbility<=trainerCapacity){
                count++;
                i++;
                j++;
            }
            if(playerAbility>trainerCapacity){
                j++;
            }

        }
        return count;
        
    }
}