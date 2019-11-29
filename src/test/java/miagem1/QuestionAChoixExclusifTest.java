package miagem1;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {

    private QuestionAChoixExclusif question;
    //Etat du monde
    //Pour tester un questionnaire, j'ai besoin de créer une instance de la classe
    // Given : une instance de question à choix exclusif
    @org.junit.Before
    public void setUp() throws Exception {
        question = new QuestionAChoixExclusif("un énoncé",  2);
    }

    @org.junit.Test
    public void testGetEnonce() {
        //When : on demande son énoncé à la question
        String resEnonce = question.getEnonce();
        //Then : l'énoncé retourné est l'énoncé fourni à la construction de la question
        assertEquals ( "un énoncé", resEnonce);
    }


    @org.junit.Test
    public void testGetScoreForIndiceBonneReponse() {
        //When : quand l'étudiant fournit l'indice de la bonne réponse
        int indiceEtudiant = 2;
        // and : on demande le score de l'indice à la question
        float resScore = question.getScoreForIndice(indiceEtudiant);
        // then : le score obtenu est 100
        assertEquals(100f, resScore, 0.01f);

    }
    @org.junit.Test
    public void testGetScoreForIndiceMauvaisReponse() {
        //When : quand l'étudiant fournit l'indice de la bonne réponse
        int indiceEtudiant = 2;
        // and : on demande le score de l'indice à la question
        float resScore = question.getScoreForIndice(indiceEtudiant);
        // then : le score obtenu est 100
    }       assertEquals(100f, resScore, 0.01f);
}