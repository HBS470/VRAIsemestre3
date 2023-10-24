public enum Mois {
        Janvier(31), Fevrier (28), Mars(31), Avril(30), Mai(31), Juin(30),
        Juillet (31), Aout(31), Septembre(30), Octobre(31), Novembre(30),
        Decembre(31);

        private int nbJours;

        Mois(int jours) {
            this .nbJours = jours;
        }
        public int getNbJours() {
            return nbJours;
        }
    }

