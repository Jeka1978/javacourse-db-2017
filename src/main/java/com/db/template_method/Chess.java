package com.db.template_method;

/**
 * Created by Evegeny on 29/08/2017.
 */
public class Chess extends BoardGame {

    @Override
    protected void updateScores() {

    }

    @Override
    protected boolean endOfGame() {
        return false;
    }

    @Override
    protected void prepareBoard() {
    }
}
