import java.util.ArrayList;

public class p39FlipBitToWin1 {
	
	
	public int findLongestSequence(ArrayList<Integer> seq) {
		int maxSeq = 1;
		for(int i = 0; i < seq.size(); i++) {
			int zerosSeq = seq.get(i);
			int onesSeqPrev = i - 1 >= 0 ? seq.get(i - 1) : 0;
			int onesSeqNext = i + 1 < seq.size() ? seq.get(i + 1) : 0;
			int thisSeq = 1;
			if(zerosSeq == 1) {
				thisSeq = onesSeqNext + 1 + onesSeqPrev;
			} else if(zerosSeq > 1) {
				thisSeq = 1 + Math.max(onesSeqPrev, onesSeqNext);
			} else if(zerosSeq == 0) {
				thisSeq = Math.max(onesSeqPrev, onesSeqNext);
			}
			maxSeq = Math.max(thisSeq, maxSeq);
		}
		return maxSeq;
	}
	
	public ArrayList<Integer> getAlternatingSequences(int n){
		ArrayList<Integer> sequences = new ArrayList<Integer>();
		int searchingFor = 0;
		int counter = 0;
		for(int i = 0; i < Integer.BYTES * 8; i++) {
			if((n & 1) != searchingFor) {
				sequences.add(counter);
				searchingFor = n & 1;
				counter = 0;
			}
			counter++;
			n >>>= 1;
		}
		sequences.add(counter);
		return sequences;
	}
	
	public int longestSequences(int n) {
		if(n == -1) return Integer.BYTES * 8;
		ArrayList<Integer> sequences = getAlternatingSequences(n);
		return findLongestSequence(sequences);
	}
	
	
}
