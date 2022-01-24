package alarm.ui.handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.PlatformUI;

import alarm.App;
import alarm.GenerateArduino;

public class GenerateArduinoFile extends AbstractHandler implements IHandler {

	@Override
	public boolean isHandled() {
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getSelection();
		if (!(selection instanceof StructuredSelection)) return null;
		StructuredSelection ss = (StructuredSelection)selection;

		for (Object o : ss) {
			if (o instanceof App) {
				App cal = (App)o;
				treatProgram(cal);
			} 
		}
		return null;
	}

	private void treatProgram(App app) {
		GenerateArduino generator = new GenerateArduino();
		generator.visit(app);
		PrintStream printer = null;
		try {
			File file = new File("arduino.ino");
			file.createNewFile();
			printer =  new PrintStream(file);
			printer.append(generator.getResult());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Impossible d'ecrire dans le fichier, voici le print");
			System.out.println(generator.getResult());
		}
		finally {
			if(printer!=null) {
				printer.close();
			}
		}
	}

}
