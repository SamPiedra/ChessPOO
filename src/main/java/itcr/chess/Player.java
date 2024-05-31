/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itcr.chess;

import java.util.ArrayList;

/**
 *
 * @author Samantha
 */
public class Player {
    private String name;
    private ChessColor color;
    private ArrayList<Piece> capturedPieces;

    public Player(String name, ChessColor color) {
        this.name = name;
        this.color = color;
        this.capturedPieces = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public ChessColor getColor() {
        return color;
    }

    
    public void addCapturedPiece(Piece piece){
    capturedPieces.add(piece);
}

}




