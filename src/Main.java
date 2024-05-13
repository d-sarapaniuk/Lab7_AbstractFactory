public class Main {
    public static void main(String[] args) {
        DataAPIFactory dataAPIFactory = new DBAPIFactory();

        DataConnection Connection = dataAPIFactory.createDataConnection();
        DataQuery Query = dataAPIFactory.createDataQuery();
        DataSerializer Serializer = dataAPIFactory.createDataSerializer();

        Connection.connect();
        Query.executeQuery();
        Serializer.serialize();
    }
}