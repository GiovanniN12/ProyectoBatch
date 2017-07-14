package com.beeva.banco.batch.bancoBatch.job.fileProcessor.process;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.beeva.banco.batch.bancoBatch.job.fileProcessor.model.Cliente;
import com.beeva.banco.batch.bancoBatch.job.fileProcessor.model.User;

@Component
public class FileProcess implements ItemProcessor <User,Cliente>{
	
	public Cliente process(User usr) throws Exception{
		
		Cliente cliente = new Cliente();
		cliente.setNombre(usr.getNombre());
		cliente.setApellido(usr.getApellido());
		
		return cliente;
	}

}
