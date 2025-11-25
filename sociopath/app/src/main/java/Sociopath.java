import java.util.List;

public class Sociopath {

	public int findTheSociopath (int groupSize, List<int []> likeList) {
		
		//groupSize is valid
		if(groupSize <= 0){
			return -1;
		}

		int[] scores = new int[groupSize + 1];
		for(int[] pair : likeList){
			//valdate pairs
			if(pair[0] > groupSize || pair[0] < 1 || pair[1] > groupSize || pair[1] < 1){
				return -1;
			}
			//reduce if they like someone
			scores[pair[0]]--;
			//add if someone likes them
			scores[pair[1]]++;
		}

		for(int i = 1; i <= groupSize; i++){
			if(scores[i] == groupSize - 1){
				return i;
			}
		}

		return -1;
	}
}
