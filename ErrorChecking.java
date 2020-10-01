public String[] OpenFile() throws IOException {

    Map<String, Double> map = new HashMap();

    FileReader fr = new FileReader("money.txt");
    BufferedReader br = new BufferedReader(fr);


    try{
        while (br.ready()){
            String str = br.readLine();
            String[] list = str.split(" ");
            System.out.println(list);               
        }
    }   catch (IOException e){
        System.err.println("Error - IOException!");
    }
}