package damas;

import java.util.Vector;

public  class AplicaTabuleiro {

    public static void aplica(Vector<?> movimentos, Tabuleiro tabuleiro1) {
        /* 243 */     if (movimentos.size() == 0) {
            /*     */       return;
            /*     */     }
        /* 246 */     int x1 = ((Par)movimentos.elementAt(0)).x;
        /*     */
        /* 248 */     int y1 = ((Par)movimentos.elementAt(0)).y;
        /*     */
        /* 250 */     int guarda = tabuleiro1.matriz[x1][y1];
        /*     */
        /* 252 */     for (int i = 0; i < movimentos.size() - 1; i++) {
            /*     */       int ix, iy;
            /* 254 */       x1 = ((Par)movimentos.elementAt(i)).x;
            /*     */
            /* 256 */       y1 = ((Par)movimentos.elementAt(i)).y;
            /*     */
            /* 258 */       int j = ((Par)movimentos.elementAt(i + 1)).x;
            /*     */
            /* 260 */       int k = ((Par)movimentos.elementAt(i + 1)).y;
            /*     */
            /* 262 */       if (j > x1) {
                /* 263 */         ix = 1;
                /*     */       } else {
                /* 265 */         ix = -1;
                /*     */       }
            /* 267 */       if (k > y1) {
                /* 268 */         iy = 1;
                /*     */       } else {
                /* 270 */         iy = -1;
                /*     */       }
            /* 272 */       for (int cx = x1, cy = y1; cx != j; cx += ix, cy += iy)
                /*     */       {
                /* 274 */         tabuleiro1.matriz[cx][cy] = 0;
                /*     */       }
            /* 276 */       tabuleiro1.matriz[j][k] = guarda;
            /*     */     }
        /*     */
        /*     */
        /* 280 */     int x2 = ((Par)movimentos.elementAt(movimentos.size() - 1)).x;
        /*     */
        /* 282 */     int y2 = ((Par)movimentos.elementAt(movimentos.size() - 1)).y;
        /*     */
        /*     */
        /* 285 */     if (Math.abs(tabuleiro1.matriz[x2][y2]) == 2) {
            /*     */       return;
            /*     */     }
        /* 288 */     if (guarda > 0 && x2 == 7) {
            /* 289 */       tabuleiro1.matriz[x2][y2] = tabuleiro1.matriz[x2][y2] * 2;
            /*     */     }
        /* 291 */     if (guarda < 0 && x2 == 0) {
            /* 292 */       tabuleiro1.matriz[x2][y2] = tabuleiro1.matriz[x2][y2] * 2;
            /*     */     }
        /*     */   }
}