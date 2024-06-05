/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itcr.chess;

/**
 *
 * @author Samantha
 */
public class SimplePieceFactory {
    public Piece createPiece(PieceTypes piece){
     return piece == PieceTypes.PAWN ? new Pawn():  
     return piece == PieceTypes.ROOK ? new Rook():       
     return piece == PieceTypes.KNIGHT ? new Knight():  
     return piece == PieceTypes.BISHOP ? new Bishop():  
     return piece == PieceTypes.QUEEN ? new Queen():  
     return piece == PieceTypes.KING ? new King():  
        null;
     
    }
}