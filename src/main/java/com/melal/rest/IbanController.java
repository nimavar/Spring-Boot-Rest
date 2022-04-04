package com.melal.rest;

import com.melal.rest.model.AccountOwner;
import com.melal.rest.model.Greeting;
import com.melal.rest.model.Message01;
import com.melal.rest.model.Message04;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@RestController
public class IbanController {

    @GetMapping("/inquiry")
    public ResponseEntity<Message04> inquiry(@RequestBody Message01 message01) {

        System.out.println(message01.toString());
        Message04  m4=new Message04();
        m4.setAccountNumber("12365478990");
        m4.setRequestedIban("000");
        m4.setAccountStatus("06");
        m4.setPaymentCode("0");
        m4.setPaymentCodeValid("0");
        m4.setAccountComment("Destination Not Found");
        m4.setErrorCode("06");
        List<AccountOwner> accountOwner=new ArrayList<>();
        AccountOwner acc1=new AccountOwner();
        acc1.setFirstName("test");
        acc1.setLastName("test");
        accountOwner.add(acc1);
        m4.setAccountOwner(accountOwner);
        m4.setReferenceNumber("0");
        System.out.println(m4.toString());
        //return new ResponseEntity<Message04>(m4, HttpStatus.BAD_GATEWAY);
        return new ResponseEntity<Message04>(m4,HttpStatus.OK);
        ////throw new Exception("TEST");
    }


    @GetMapping("/inquiry2/{id}")
    public String getId(@PathVariable  String id) {

        System.out.println(id);

        //return new ResponseEntity<Message04>(m4, HttpStatus.BAD_GATEWAY);
        return id;
        ////throw new Exception("TEST");
    }

    @GetMapping("/inquiry3/{id}")
    public List<String> getIds(@PathVariable  String id) {

        System.out.println(id);

        List<String> lst=new ArrayList<String>();
        lst.add("NIMA");
        lst.add("ALI");
       // return new ResponseEntity<String>(lst, HttpStatus.BAD_GATEWAY);
        return lst;
        ////throw new Exception("TEST");
    }

    @GetMapping("/inquiry4/{id}")
    @Async
    public Future<String> getIdsAsync(@PathVariable  Integer id) throws InterruptedException {


        System.out.println(id + "--" + Thread.currentThread().getName());
        Thread.sleep(1000);
        return new AsyncResult<String>(getName(id));
    }

    private String getName(Integer  id){
        String name="";
        HashMap<Integer,String > map=new  HashMap<Integer,String >();
        map.put(1,"NIMAAAAAAA");
        map.put(2,"ALiiiiiiii");
        map.put(3,"Rezaaaaaaa");
        System.out.println("----------------------------------------");
      for(Integer key : map.keySet()){
          System.out.println(key + " = " + map.get(key));
      }

        List<Integer> lst=new ArrayList<Integer>();
        List<Integer> lst2=new ArrayList<Integer>();
        lst.add(10);
        lst.add(30);

       int a=lst.stream().filter(x->x>10).mapToInt(Integer::intValue).sum();



        List<String> lists=Arrays.asList("MOSTAFA","REZA","ENIGMA");

        List<String> bb= lists.stream().takeWhile(y->y.contains("M")).collect(Collectors.toList());



        name=map.get(id);
        return name;
    }

}
