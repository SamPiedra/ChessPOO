/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itcr.chess;

/**
 *
 * @author Samantha
 
public class SimplePieceFactory {
    public Piece createPiece(PieceTypes piece, ChessColor color){
            switch(piece){
                case PAWN -> {
                    return new Pawn(color);
            }
                case ROOK -> {
                    return new Rook(color);
            }
                case KNIGHT -> {
                    return new Knight(color);
            }
                case BISHOP -> {
                    return new Bishop(color);
            }
                case QUEEN -> {
                    return new Queen(color);
            }
                case KING -> {
                    return new King(color);
            }
            }
        }
}
*/