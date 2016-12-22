
package de.ailis.pherialize.test;

import de.ailis.pherialize.MixedArray;
import de.ailis.pherialize.Pherialize;

/**
 *
 * @author ducnt114
 */
public class ObjectUnserialize {
    
    public static void main(String[] args) {
        String serializedString = "a:6:{s:9:\"action_id\";i:1305194;s:10:\"contact_id\";i:18244;s:7:\"shop_id\";i:2437;s:10:\"event_type\";s:10:\"email_send\";s:6:\"params\";a:5:{s:8:\"email_id\";i:142196;s:10:\"email_type\";s:18:\"newsletter_default\";s:17:\"email_template_id\";i:64409;s:19:\"email_campaign_type\";s:10:\"newsletter\";s:20:\"email_real_sent_time\";O:8:\"DateTime\":3:{s:4:\"date\";s:26:\"2016-12-22 08:40:18.507000\";s:13:\"timezone_type\";i:3;s:8:\"timezone\";s:3:\"UTC\";}}s:9:\"timestamp\";i:1482396051;}";
        
        MixedArray data = Pherialize.unserialize(serializedString).toArray();
        
        System.out.println(data);
        
    }

}
