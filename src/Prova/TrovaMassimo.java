package Prova;

public class TrovaMassimo {
int max (int[]data) {
	int max = 0;
	for (int i = 0; i<data.length+1; i++) {
		Math.max(max, data[i]);
	}
	return max;
}

}
