public class Database {
    final Livre[] listLivres = {
            new Livre(2, "Pinocchio"),
            new Livre(5, "Maria Chapdelaine"),
            new Livre(7, "L'Homme invisible"),
            new Livre(10, "Contes fantastiques"),
            new Livre(13, "L'Assassin habite au 21"),
            new Livre(17, "L'Agent secret"),
            new Livre(22, "Robinson Crusoe"),
            new Livre(25, "Les aventures d'Alice au pays des merveilles"),
            new Livre(29, "Voyage au centre de la terre"),
            new Livre(30, "Famille suisse Robinson"),
            new Livre(31, "Trois mousquetaires"),
            new Livre(35, "Aurélia"),
            new Livre(36, "Les deux orphelines"),
            new Livre(40, "Le joueur")
    };

    final Algorithm[] listAlg = {
            new AlgorithmLineaire(),
            new AlgorithmLineaireTrier(),
            new AlgorithmBinaire()
    };
}
