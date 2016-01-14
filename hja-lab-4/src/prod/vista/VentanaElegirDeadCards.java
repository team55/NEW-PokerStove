package prod.vista;

import prod.controlador.Controlador;
import prod.controlador.ResultadoSimulacion;
import prod.modelo.rangos.RangoSoloLectura;
import prod.observadores.I_Observador;

@SuppressWarnings("serial")
public class VentanaElegirDeadCards extends VentanaElegirCartas implements I_Observador {
    
	private Controlador controlador;
	
	public VentanaElegirDeadCards(Controlador controlador) {
		super(12);
		this.controlador = controlador;
		
		this.controlador.addObservador(this);
	}
	
	protected void llamadaAlControlador(String cartas) {
		controlador.marcaDeadCards(cartas);
		this.setVisible(false);
	}

	@Override
	public void onRangoModificado(RangoSoloLectura r, int jugadorActual) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStringRangoModificado(String entero, int jugadorActual) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAttach(RangoSoloLectura r, int jugadorActual) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onActualizaOutput(char juego, String[] rangos, String board, String dead, double tiempo, ResultadoSimulacion resultado) {

	}

	@Override
	public void onCartasJugOmahaModificadas(String cartas, int jugadorActual) {
		
	}

	@Override
	public void onBoardModificado(String stringCartas) {
		
	}

	@Override
	public void onDeadCardsModificadas(String stringCartas) {
		marcaCartas(stringCartas);
	}

	@Override
	public void onClearAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRangoInsertado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRankingInsertado(String nuevoRanking) {
		// TODO Auto-generated method stub
		
	}

}