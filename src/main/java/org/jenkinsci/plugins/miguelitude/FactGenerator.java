/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.miguelitude;

import java.util.Random;

/**
 * {@link FactGenerator} provides Chuck Norris facts.
 * @author cliffano
 */
public class FactGenerator {

    /**
     * The configured Chuck Norris facts, from <a href="http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-programmer-jokes/"
     * >http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-
     * programmer-jokes/</a>.
     */
    private static final String[] FACTS = {
    	"Ce serait avoir une vision simplissiste.",
    	"Le patrimoine brut, c'est le patrimoine net.",
    	"Ils croivent tout ce qu'on leur dit, j'en suis stupéfié.",
    	"Est-ce que 'rien' et 'néant', c'est 2 choses distinctes ?",
    	"Toi, comment tu te représentes l'infini ?",
    	"Après ce qu'il a dit, je vais le prendre au jeu de mot.",
    	"L'inertie, c'est comme E = MVC",
    	"Il est au bord du divorcement.",
    	"Il ne faut pas prendre son cas pour tout le monde.",
    	"Supposons que tu aies une tapette tactile...",
    	"Quand tu commences à utiliser 'vi', c'est que tu as compris à quoi sert l'informatique.",
    	"Tony, quand tu dis 'tous les trimestres', tu veux dire tous les 3 mois ?",
    	"Faut pas que je me trompe, sinon il va nous faire des jaguzzis.",
    	"L'IHM est la couche la plus instable. J'en ai encore des impacts sur les dents.",
    	"Cet outil est techno agnostique.",
    	"Ils se déchirent les cheveux, en ce moment !",
    	"L'employeur abusait, alors les employés ont fait la ola par rapport à ça.",
    	"Vous connaissez la méthode de développement SFP ? ça veut dire 'Sauve Qui Peut'.",
    	"Hier j'ai mal dormi, je suis un peu ratapla",
    	"Va y avoir des petites modifs, mais ce ne sera pas des grosses",
    	"Tu prends un marteau-piqueur pour écraser... un puceron !",
    	"- Tu veux récupérer les 2 ordis ? - Non, non, je veux juste les 2 !",
    	"Notre appli ne fait pas autre plus quelque chose.",
    	"A la fin, ils coûtent énormément un certain cher.",
    	"Faut pas qu'on parte comme ça, la tête en bille...",
    	"Il faut bien tester que tout marche de bout en chaine",
    	"Je te passe pas le crayon, sinon je serais perdu.",
    	"On est les chausseurs mal chaussés.",
    	"Tant bien que même...",
    	"Je fais faire du ski à ma fille pour la décarcasser.",
    	"Au sommet de Copenhague, s'ils ne se mettent pas tous d'accord, c'est comme pisser dans un tonneau !",
    	"En fait, l'homme hiberne en hiver.",
    	"J'ai lu un article très interessant sur l'insanité des API stables",
    	"Un intervalle de temps a un début de date et un début de fin,",
    	"Avec la phobie de la grippe A, on se lave mes mains tous les 36 du mois.",
    	 "Je vais faire un 'round-up' pour revenir aux sources d'avant.",
    	"Checkstyle, ça n'apporte rien, c'est un dictateur !",
    	"Au foot, il manque une surveillance vidéo des fautes d'orthographe.",
    	"Ah, je sens que je vais être en forme ce soir ! Euh, cet après-midi je veux dire !",
    	"Qu'est-ce que tu envisionnes de faire ?",
    	"Le build a démarré suffisamment trop longtemps",
    	"A tous les coups, peut-être que ça n'arrivera jamais",
    	"Il ne faut pas se leurrer la face",
    	"d'après la doc que je lis entre les yeux",
    	"Ta soeur est plus charpue que toi !",
    	"Promis, l'année prochaine, j'amène des biscuits",
    	"H, F, C, F... Oui, avec un F comme Toto ! Heu, non...",
    	"Il faudrait plusieurs testeurs pour en faire le tour",
    	"C'est pas moi qui fait de la couture, c'est la couture qui me fait",
    	"Quand je ne suis pas là, les loups dansent ! ",
    	"Word, pour écrire des documents Word, c'est limite",
    	"- Tu visualises en full écran ?",
    	"Quand on me fait miroiter la girouette, moi...",
    	"En grosso-basta...",
    	"Ca veut dire quoi, 'rien' ? Là, il n'y a rien, mais il y a des molécules d'air !",
    	"L'aïkido, c'est essentiellement du sang. Heu, du sens.",
    	"Une règle est soit actif, soit désactif.",
    	"Notre mission premier, c'est de réussir avec succès.",
    	"Je suis pas divin, mais je pense que...",
    	"En quelque part, qui peut plus, le peut moins.",
    	"Y'avait l'existant qui existait",
    	"En grosso-modo, il faut des tests simples, c-à-d pas compliqués, quitte à en avoir beaucoup plusieurs.",
    	 "En chinois, la lettre 'Q' se prononce 'tch'.",
    	"Et là, le questionnaire, pfuit, il chuinte.",
    	"Je me suis erroné" };

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();;

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}
