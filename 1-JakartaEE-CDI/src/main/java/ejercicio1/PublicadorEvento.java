package ejercicio1;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

@ApplicationScoped
public class PublicadorEvento {
	
	@Inject
	private Event<Evento> eventoConcreto;

	public void publicarEvento(String descEvento) {
		Evento e = new Evento(descEvento);
		eventoConcreto.fire(e);
		
		System.out.println("Notificando evento: " + descEvento);
	}
}