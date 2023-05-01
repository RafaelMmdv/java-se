package IOC2;

import IOC1.Faculty;

public class BackendServer implements Server{

    Backend backend;

    public BackendServer(Backend backend){

        this.backend = backend;
    }

    @Override
    public void serverConnect() {

    }


//    @Override
//    public void javaServer() {
//        String serverConnect = Server.();
//
//    }
}
