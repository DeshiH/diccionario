package DiccionarioEN;

import java.util.HashMap;

import java.util.Random;
import java.util.Scanner;
public class Diccionario {

	public static void main(String[] args) {
				
		 
		
		HashMap<String, String> dictionary = new HashMap<>(); //Utilizamos un objeto 'HashMap' para almacenar las palabras.
				
		
		// Crear un diccionario Español-Inglés
	    dictionary.put("hola", "hello");
	    dictionary.put("por", "by");
	    dictionary.put("hacer", "do");
	    dictionary.put("tú", "you");
	    dictionary.put("no", "not");
	    dictionary.put("para", "for");
	    dictionary.put("yo", "i");
	    dictionary.put("gato", "cat");
	    dictionary.put("y", "and");
	    dictionary.put("sol", "sun");
	    dictionary.put("ser o estar", "be");
	    dictionary.put("arbol", "tree");
	    dictionary.put("libro", "book");	    
	    dictionary.put("uno", "one");
	    dictionary.put("mi", "my");
	    dictionary.put("o", "or");
	    dictionary.put("ella", "she");
	    dictionary.put("decir", "say");
	    dictionary.put("dia", "day");
	    dictionary.put("dar", "give");
	    dictionary.put("porque", "because");
	    dictionary.put("nuevo", "new");
	    dictionary.put("bien", "well");
	    dictionary.put("primero", "first");
	    dictionary.put("también", "also");	    
	    dictionary.put("su", "its");
	    dictionary.put("ahora", "now");
	    dictionary.put("ver", "see");	    
	    dictionary.put("tomar", "take");
	    dictionary.put("no", "no");
	    dictionary.put("él", "him");	    
	    dictionary.put("todo", "all");
	    dictionary.put("hacer", "make");
	    dictionary.put("ir", "go");
	    dictionary.put("quién", "who");
	    dictionary.put("si", "if");
	    dictionary.put("arriba", "up");
	    dictionary.put("obtener", "get");
	    dictionary.put("qué", "what");

	    // Obtenemos una lista de las palabras en español del diccionario gracias al Hash.
	    String[] spanishWords = dictionary.keySet().toArray(new String[0]);

	    // Creamos un objeto Random para seleccionar las palabras al azar.
	    Random random = new Random();

	    // Creamos un Scanner para leer la entrada del usuario.
	    Scanner scanner = new Scanner(System.in);
	 
// Declaramos las respuestas correctas e incorrectas en 0
	    int correctAnswers = 0;
	    int incorrectAnswers = 0;

	    // Seleccionamos 5 palabras al azar del minidiccionario usando el for, recorrera todas las palabras y arrojara 5 para que el usuario las traduzca
	   // El elemento que se está asignando es el que se encuentra en la posición indicada por la variable index.
	    
	    for (int i = 0; i < 5; i++) {
	      int index = random.nextInt(spanishWords.length);
	      String spanishWord = spanishWords[index];
	      String englishWord = dictionary.get(spanishWord);

	      System.out.print("Traducción de " + spanishWord + ": ");
	      String userAnswer = scanner.nextLine();

	      
	      //Mostramos las respuestas correctas e incorrectas que tiene el usuario usando un if y else
	      if (userAnswer.equals(englishWord)) {
	        correctAnswers++;
	        System.out.println("Correcto");
	      } else {
	        incorrectAnswers++;
	        System.out.println("La respuesta correcta es " + englishWord);
	      }
	    }

	    System.out.println("Tus respuestas correctas son: " + correctAnswers + " Y tus respuestas incorrectas son: " + incorrectAnswers);
	  }
	}
		