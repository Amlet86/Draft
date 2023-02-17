package amlet.network;

import lombok.SneakyThrows;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

import static java.net.InetAddress.getLocalHost;

public class Address {

    @SneakyThrows
    public void exercise() {
        InetAddress inetAddress = getLocalHost();
        System.out.println(inetAddress.getHostName());
        System.out.println("=================================");

        Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaceEnumeration.hasMoreElements()) {
            String interfaceName = networkInterfaceEnumeration.nextElement().getName();
            NetworkInterface networkInterface = NetworkInterface.getByName(interfaceName);
            System.out.println("Интерфейс называется: " + interfaceName);
            System.out.println("Интерфейс поднят: " + networkInterface.isUp());
            System.out.println("Интерфейс виртуальный: " + networkInterface.isVirtual());
            System.out.println("Интерфейс loopback: " + networkInterface.isLoopback());
            System.out.println("=================================");
        }
    }
}
