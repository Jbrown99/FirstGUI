/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

/**
 *
 * @author jbrown99
 */
public class MessageService {
    
    private String msgPrefix = "Hello ";
    
    public String createMessage(String suffix){
        return msgPrefix + suffix;
    }

    public String getMsgPrefix() {
        return msgPrefix;
    }

    public void setMsgPrefix(String msgPrefix) {
        this.msgPrefix = msgPrefix;
    }
 
    
    
}
