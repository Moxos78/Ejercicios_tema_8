public class Main {
    public static void main(String[] args)
    {
        Persona juan=new Persona();
        juan.setEdad(30);
        juan.setNombre("Juan Carlos Martinez");
        juan.setTelefono("+584 15454547");
        System.out.println("Nombre: "+juan.getNombre());
        System.out.println("Edad: "+juan.getEdad());
        System.out.println("Telefono: "+juan.getTelefono());
    }
}