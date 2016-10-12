/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitrepo;


public class Person {
    
    String firstName;
    String lastName;
     String nickname = "Benny ze killer";

    @Override
    public String toString() {
        return "This is Sir. :" + lastName + " of " + firstName + " and " + nickname;
    }
}

