package com.db.template_method;

/**
 * Created by Evegeny on 29/08/2017.
 */
public abstract class BoardGame {
    protected Player player1;
    protected Player player2;
    protected Board board;
    public final void play(){
        prepareBoard();
        while (!endOfGame()) {
            player1.play();
            player2.play();
        }
        updateScores();
    }

    protected abstract void updateScores();

    protected abstract boolean endOfGame();

    protected abstract void prepareBoard();
}
