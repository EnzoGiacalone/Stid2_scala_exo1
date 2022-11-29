class Etudiant(nomEtu:String,prenomEtu:String,ageEtu:Int,adresseEtu:String) {
    var nom:String=nomEtu
    var prenom:String=prenomEtu
    var age:Int=ageEtu
    var adresse:String=adresseEtu

    def changeAge(newAge:Int)
    {
        age = newAge
    }

    def changeAdresse(newAdresse:String)
    {
        adresse = newAdresse
    }
    override def toString():String=nom+" "+prenom+" "+age+" "+adresse
}

class Note(numEtu:Int,nomModule:String,noteEtu:Double){
    var num:Int=numEtu
    var module:String=nomModule
    var note:Double=noteEtu

    def ChangeNote(newNote:Double){
        note = newNote
    }

    def toNote():String=num+" "+module+" "+note
}

object STID2 {
    def main(args:Array[String]) {
        val etudiant1 = new Etudiant("Jean", "Philippe", 20,"15 rue de Niort,79000")
        println(etudiant1.nom+" "+etudiant1.age)
        etudiant1.changeAge(21);
        println(etudiant1.nom+" "+etudiant1.age)
        etudiant1.changeAge(22);
        println(etudiant1.nom+" "+etudiant1.age)
        etudiant1.changeAdresse("14 rue de Poitiers");
        println(etudiant1.nom+" "+etudiant1.age)
        println(etudiant1.toString())
   
        val etudiant2 = new Etudiant("Enzo", "Giacalone", 20,"7 rue du Galuchet,79000")
        etudiant2.changeAdresse("49 rue de Marseille");
        println(etudiant2.toString())

        val note1 = new Note(22008427, "Stats",20)
        println(note1.toNote())
        note1.ChangeNote(19)
        println(note1.toNote())
    }
}