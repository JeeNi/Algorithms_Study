class KiwiJuice {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for(int i = 0; i < fromId.length; i ++) {
            int f = fromId[i];
            int t = toId[i];
            int space = capacities[i] - bottles[i];
            
            if (space >= bottles[f]) {
                int vol = bottles[f];
                
            }

        }
    }
}