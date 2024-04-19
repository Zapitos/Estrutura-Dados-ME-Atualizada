import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Aluno> lista = new ArrayList<>();


        System.out.printf("Hello and welcome!");


        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();


        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("José");
        a6.setNome("Miguel");
        a7.setNome("Teste");
        a8.setNome("Novo Aluno 8"); // Exemplos para os demais alunos
        a9.setNome("Novo Aluno 9");
        a10.setNome("Novo Aluno 10");
        a11.setNome("Novo Aluno 11");
        a12.setNome("matheus");
        a13.setNome("Novo Aluno 13");
        a14.setNome("Novo Aluno 14");
        a15.setNome("Novo Aluno 15");

        System.out.println("\nAlunos: " + a2.getNome());

        System.out.println("Alunos: " + a1.getNome());

        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        lista.add(a6);
        lista.add(a7);
        lista.add(a8);
        lista.add(a9);
        lista.add(a10);
        lista.add(a11);
        lista.add(a12);
        lista.add(a13);
        lista.add(a14);
        lista.add(a15);

        System.out.println("Total de alunos: " + lista.size());
        System.out.println(lista);
        System.out.println(lista.contains(a5));

        lista.remove(7);
        lista.remove(8);

        System.out.println(lista);
        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();

        a16.setNome("Saulo");
        a17.setNome("Lucas");

        lista.add(7, a16);
        lista.add(8, a17);

        System.out.println(lista);


    }
}