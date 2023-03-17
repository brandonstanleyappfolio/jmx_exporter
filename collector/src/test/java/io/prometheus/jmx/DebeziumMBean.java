package io.prometheus.jmx;

import javax.management.*;
import javax.management.MBeanServer;
import javax.management.ObjectName;

public interface DebeziumMBean {
    public int getTotalNumberOfEventsSeen();
    public int getTotalNumberOfCreateEventsSeen();
}

class Debezium implements DebeziumMBean {

    public static void registerBean(MBeanServer mbs)
            throws javax.management.JMException {
        ObjectName mbeanName = new ObjectName(
                "debezium.mysql:type=connector-metrics,context=streaming,server=dbserver1");
        Debezium mbean = new Debezium();
        mbs.registerMBean(mbean, mbeanName);
    }


    public int getTotalNumberOfEventsSeen() {
        return 1;
    }

    public int getTotalNumberOfCreateEventsSeen() {
        return 1;
    }
}

