/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itcr.chess;

import static java.lang.Math.abs;

/**
 *
 * @author Samantha
 */
public class Bishop extends Piece {
    private int x;
    private int y;

    //Constructor
    public Bishop(ChessColor color, int x, int y){
    super(color);
    this.x = x;
    this.y = y;
    }
    //Posiciones de Bishop
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
                 
    //Movimiento es permitido?
    public boolean isMoveAllowed(Board board, int targetX, int targetY){
        int horizontalDistance = abs(this.x - targetX);
        int verticalDistance = abs(this.y - targetY);
        //Solo movimientos diagonales
        if (horizontalDistance != verticalDistance){
            return false;
        }
        
        int xMove = (targetX > this.x) ? 1:-1;
        int yMove = (targetY > this.y) ? 1: -1;
        int actualX = this.x + xMove; //Inicializar posiciones
        int actualY = this.y + yMove;
        
        //Realizar recorrido de la pieza
        while (actualX != targetX && actualY != targetY){
            if (!board.isSquareEmpty(actualX, actualY)){
            return false;
            }
        }
        //Avanza en las direcciones
        actualX += xMove;
        actualY += yMove; 
        //Pieza debe ser de diferente color
        if (!board.isSquaraeEmpty(targetX, targetY)){
        Piece pieceInPosition = board.getPieceInSquare(targetX, targetY);
        if(pieceInPosition.getColor() == this.getColor()){
        return false;
         }
        }
        //Movimiento válido
        return true;    
    }
}
