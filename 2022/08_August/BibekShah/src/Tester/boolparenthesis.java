package Tester;

class boolparenthesis {

	static int counter(char symb[], char oper[], int n) {
		int F[][] = new int[n][n];
		int T[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			F[i][i] = (symb[i] == 'F') ? 1 : 0;
			T[i][i] = (symb[i] == 'T') ? 1 : 0;
		}

		for (int g1 = 1; g1 < n; ++g1) {
			for (int i = 0, j = g1; j < n; ++i, ++j) {
				T[i][j] = F[i][j] = 0;
				for (int g = 0; g < g1; g++) {
					int k = i + g;

					int tpp = T[i][k] + F[i][k];
					int tkj = T[k + 1][j] + F[k + 1][j];

					if (oper[k] == '&') {
						T[i][j] += T[i][k] * T[k + 1][j];
						F[i][j] += (tpp * tkj - T[i][k] * T[k + 1][j]);
					}
					if (oper[k] == '|') {
						F[i][j] += F[i][k] * F[k + 1][j];
						T[i][j] += (tpp * tkj - F[i][k] * F[k + 1][j]);
					}
					if (oper[k] == '^') {
						T[i][j] += F[i][k] * T[k + 1][j] + T[i][k] * F[k + 1][j];
						F[i][j] += T[i][k] * T[k + 1][j] + F[i][k] * F[k + 1][j];
					}
				}
			}
		}
		return T[0][n - 1];
	}

	public static void main(String[] args) {
		char symbol[] = "TFFTFFFTTTTFTFFTTF".toCharArray();
		char operator[] = "|^&|^^^|&^|^^&^|^".toCharArray();
		int n = symbol.length;
		System.out.println(counter(symbol, operator, n));
	}
}