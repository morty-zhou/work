package com.example.myapplication;

public class BowlingGame {

    int pins[] = new int[21];
    int currentPinIndex = 0;
    public void roll(int pin) {
        pins[currentPinIndex++] = pin;
    }

    public int score() {
        int totleScore = 0;
        int currentFrameScoreIndex = 0;
        for(int currentFrame = 0;currentFrame<10;currentFrame++){

            totleScore+=pins[currentFrameScoreIndex];

            if(isaStrike(currentFrameScoreIndex)){
                totleScore+=pins[currentFrameScoreIndex+1];
                totleScore+=pins[currentFrameScoreIndex+2];
            } else if(isaSpare(currentFrameScoreIndex)){

                    totleScore+=pins[currentFrameScoreIndex+1];
                    totleScore+=pins[currentFrameScoreIndex+2];
                    currentFrameScoreIndex++;
            }else {
                totleScore+=pins[currentFrameScoreIndex+1];
                currentFrameScoreIndex++;
            }
            currentFrameScoreIndex++;
        }
        return totleScore;
    }

    private boolean isaSpare(int scoreIndex) {
        return 10 == pins[scoreIndex] + pins[scoreIndex + 1];
    }
    private boolean isaStrike(int scoreIndex) {
        return 10 == pins[scoreIndex];
    }
}
