import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
interface header
{

}
class headclass implements header
{  static String headstr="";
	public static String re;
	   Scanner sc=new Scanner(System.in);
      void css()
      { System.out.println("Entering the html code");

     		headstr="<!doctype html>\n<html>\n<head>\n<link rel='stylesheet' href='css.css'>\n";
      }
      void title()
      {
      System.out.println("Enter the title");
      re=sc.next();
      headstr=headstr+"\n<title>";
      headstr=headstr+re;
      headstr=headstr+"</title>\n<meta charset='utf-8'>\n<meta name='viewport' content='width=device-width, initial-scale=1'>\n<link rel='stylesheet'href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>\n<link href='https://fonts.googleapis.com/css?family=Lato'rel='stylesheet' type='text/css'>\n<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>\n<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script>\n<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script></head>\n";
      
      }
       
}
interface footer
{
static String footstr1="";
}
class guitrial extends JFrame implements ActionListener
{
static String str="";
static int gui=0;
JPanel textPanel,emailPanel,phnoPanel,resetPanel,submitPanel,donePanel,radioPanel,checkPanel;
JTextField txtdata,radioname,radiovalue,checkname,checkvalue;
JButton txtbtn,emailbtn,phnobtn,resetbtn,submitbtn,donebtn,radiobtn,checkbtn;
public JPanel createContentPane()
{
      JPanel totalGUI = new JPanel();
      totalGUI.setLayout(new GridLayout(0,1));

      textPanel = new JPanel();
      textPanel.setLayout(new GridLayout(0,1));
      totalGUI.add(textPanel);
       
      txtbtn = new JButton("text box");
      textPanel.add(txtbtn);
      txtbtn.addActionListener(this);
      txtdata = new JTextField();
      textPanel.add(txtdata);
      textPanel.setBorder(BorderFactory.createEtchedBorder());
              
           
      radioPanel = new JPanel();
      radioPanel.setLayout(new GridLayout(0,1));
      totalGUI.add(radioPanel);
       

      radiobtn = new JButton("radio box");
      radioPanel.add(radiobtn);
      radiobtn.addActionListener(this);
      radioname = new JTextField();
      radioPanel.add(radioname);
      radiovalue = new JTextField();
      radioPanel.add(radiovalue);
      radioPanel.setBorder(BorderFactory.createEtchedBorder()); 
       
      checkPanel = new JPanel();
      checkPanel.setLayout(new GridLayout(0,1));
      totalGUI.add(checkPanel);
       
      checkbtn = new JButton("check box");
      checkPanel.add(checkbtn);
      checkbtn.addActionListener(this);
      checkname = new JTextField();
      checkPanel.add(checkname);
      checkvalue = new JTextField();
      checkPanel.add(checkvalue);
      checkPanel.setBorder(BorderFactory.createEtchedBorder());

      emailPanel = new JPanel();
      emailPanel.setLayout(new GridLayout(0,1));
      totalGUI.add(emailPanel);

      emailbtn = new JButton("email box");
      emailPanel.add(emailbtn);
      emailbtn.addActionListener(this);
      emailPanel.setBorder(BorderFactory.createEtchedBorder());
      
        
      phnoPanel = new JPanel();
      phnoPanel.setLayout(new GridLayout(0,1));
      totalGUI.add(phnoPanel);

      phnobtn = new JButton("ph no box");
      phnoPanel.add(phnobtn);
      phnobtn.addActionListener(this);
      phnoPanel.setBorder(BorderFactory.createEtchedBorder());
      
       
      resetPanel = new JPanel();
      resetPanel.setLayout(new GridLayout(0,1));
      totalGUI.add(resetPanel);

       resetbtn = new JButton("reset box");
       resetPanel.add(resetbtn);
       resetbtn.addActionListener(this);
       resetPanel.setBorder(BorderFactory.createEtchedBorder());
        
        
       submitPanel = new JPanel();
       submitPanel.setLayout(new GridLayout(0,1));
       totalGUI.add( submitPanel);

       submitbtn = new JButton(" submit box");
       submitPanel.add(submitbtn);
       submitbtn.addActionListener(this);
       submitPanel.setBorder(BorderFactory.createEtchedBorder());
       
        
       donePanel = new JPanel();
       donePanel.setLayout(new GridLayout(0,1));
       totalGUI.add(donePanel);

       donebtn = new JButton(" done form");
       donePanel.add(donebtn);
       donebtn.addActionListener(this);
       donePanel.setBorder(BorderFactory.createEtchedBorder());
       
       
       totalGUI.setOpaque(true);
       return totalGUI;
}

public void actionPerformed(ActionEvent z)
{
     if(z.getSource() ==txtbtn)
        {
              String var=txtdata.getText();
              str=str+var;
              str=str+"<br>\n<input type='text' name='";
              str=str+var;
              str=str+"'>\n<br>\n";
        }
     if(z.getSource() ==radiobtn)
        {
              str=str+"select "+radioname.getText()+"\n<br>\n<input type='radio' name='"+radioname.getText()+"' value='"+radiovalue.getText()+"'>  "+radiovalue.getText()+"<br>\n";
        }
     if(z.getSource() ==checkbtn)
        {
              str=str+"select "+checkname.getText()+"\n<br>\n<input type='checkbox' name='"+checkname.getText()+"' value='"+checkvalue.getText()+"'>  "+checkvalue.getText()+"<br>\n";
        }
     if(z.getSource() ==emailbtn)
        {
              str=str+"\n<br>Enter email id<br>\n<br>\n<input type='email' name='email'><br>";
        }
     if(z.getSource() == phnobtn)
        {
              str=str+"\n<br>Enter phone number<br>\n<br>\n<input type='number' name='number'><br>";
        }
     if(z.getSource() == resetbtn)
        {
              str=str+"\n<br>\n<input type='reset'><br>";
        }
     if(z.getSource() == submitbtn)
        {
              str=str+"\n<br>\n<input type='submit'><br>";
        }
     if(z.getSource() == donebtn)
        {
                     gui=1;
         }
}
 
 static void createAndShowGUI() 
{
        String strr;
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("form");
        guitrial demo = new guitrial();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 190);
        frame.setVisible(true);
       
}
}


class footerclass extends guitrial implements footer
{

	static String footstr="";
    Scanner sc=new Scanner(System.in);
    void form()
    {
      footstr=footstr+"<div class='centre'><form class='container text-left light'>\n<fieldset>\n<legend  style='color:white'>";
      int form=1;
      System.out.println("Enter form heading");
      footstr=footstr+sc.nextLine();
      footstr=footstr+"</legend>\n";
       try{
        SwingUtilities.invokeAndWait(new Runnable() {

            public void run() {
                guitrial.createAndShowGUI();
            }
        }); 
         }
        catch(Exception w)
        { System.out.println("interrupted exception");
        }
      while(gui==0)
      {int d=0;
      d=d+1;
      }
        footstr=footstr+str+"</fieldset>\n</form></div>";
      }
     void contactdetails()
         {
         footstr=footstr+"<div class='container text-left'><h3 >Contact and Feedback</h3>\n<br><div class='col-md-8'>\n<div class='row'>\n<div class='col-sm-6 form-group'>\n<input class='form-control' id='name' name='name' placeholder='Name' type='text' required>\n</div>\n<div class='col-sm-6 form-group'>\n<input class='form-control' id='email' name='email' placeholder='Email' type='email' required>\n</div>\n</div>\n<textarea class='form-control' id='comments' name='comments' placeholder='Comment' rows='5'></textarea>\n<br>\n<div class='row'>\n<div class='col-md-12 form-group'>\n<button class='btn pull-right' type='submit'>Send</button>\n</div>\n</div>\n</div>\n</div>\n<br>\n";
         }
     void endfooter()
           {
            footstr=footstr+"<footer class='text-center'>\n</a>\n<p>";
            footstr=footstr+sc.nextLine();
            footstr=footstr+"</p>\n</footer>";
            }
            
       void end()
       {
        footstr=footstr+"</body>\n</html>";
       }
       }

interface body
{
	 default String item_active(String img,String alt,String cap,String desc)
	 {
		 return ("<div class='item active'>\n<img src='"+img+"' alt='"+alt+"'>\n<div class='carousel-caption'>\n<h3>"+cap+"</h3>\n<p>"+desc+"</p>\n</div> \n</div>");
}
default String item(String img,String alt,String cap,String desc)
	 {
		 return ("<div class='item'>\n<img src='"+img+"' alt='"+alt+"'>\n<div class='carousel-caption'>\n<h3>"+cap+"</h3>\n<p>"+desc+"</p>\n</div> \n</div>");
}
}
class bodyclass implements body
{
	static String bodyst="";
	static Scanner sc=new Scanner(System.in);
	void headarticle()
	{
			bodyst="<br><div class='container text-center dark'>\n<h3>";
			System.out.println("Enter the heading of your article:");
			String headingtext=sc.nextLine();
			bodyst+=headingtext;
			bodyst+="</h3>";
	}
	void article_text()
	{
		bodyst+="<p>";
		System.out.println("Please enter the text for the article");
		String te=sc.nextLine();
		bodyst+=te+"</p>";
	}
	void article_image()
	{
		System.out.println("Please enter the source and alternate text to be displayed");
		String sr=sc.nextLine();
		String al=sc.nextLine();
		bodyst+="<img class='sizeimg' src='"+sr+"' alt='"+al+"'><br>";
	}
	void article_links()
	{
		System.out.println("Please enter the link and text to be displayed");
		String li=sc.nextLine();
		String te=sc.nextLine();
		System.out.println("Input"+li);
		bodyst+="<p><a href='"+li+"'>"+te+"</a></p>";
	}
		
	void closearticle()
	{
		bodyst+="</div><br>";
	}
	void carousel(int n)
	{
		bodyst+="\n<div id='myCarousel' class='carousel slide' data-ride='carousel'>\n<ol class='carousel-indicators'>\n <li data-target='#myCarousel' data-slide-to='0' class='active'></li>";
		for(int j=1;j<n;j++)
			bodyst+="\n<li data-target='#myCarousel' data-slide-to='1'></li>";
		bodyst+="\n</ol><div class='carousel-inner' role='listbox'>'";
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the image, caption and description");
			String img=sc.nextLine();
			String cap=sc.nextLine();
			String desc=sc.nextLine();
			if(i==1)
			{
				bodyst+=item_active(img,"some alt",cap,desc);
			}
			else
			{
				bodyst+=item(img,"some alt",cap,desc);
			}
		}
		bodyst+="\n</div>\n<a class='left carousel-control' href='#myCarousel' role='button' data-slide='prev'>\n<span class='glyphicon glyphicon-chevron-left' aria-hidden='true'></span>\n<span class='sr-only'>Previous</span></a><a class='right carousel-control' href='#myCarousel' role='button' data-slide='next'>\n<span class='glyphicon glyphicon-chevron-right' aria-hidden='true'></span>\n<span class='sr-only'>Next</span>\n</a>\n</div>";
	}
		
}	
		
		
	






class gettingstr implements header,body,footer
{
	static Scanner sc=new Scanner(System.in);
	public String run()
	{
		String bst="";
		
		headclass a=new headclass();
		a.css();
		a.title();
		//System.out.println(headclass.headstr);
		
		//bodyclass being called
		int ch1;
		bodyclass b1=new bodyclass();
		System.out.println("Would you like a carousal?\n1. Yes\n2.No");
		int c2=sc.nextInt();
		if(c2==1)
		{
			System.out.println("How many slides would you like?");
			int nslides=sc.nextInt();
			b1.carousel(nslides);
		}
		//System.out.println("BODYST With carousel\n"+bodyclass.bodyst);
		bst="<body>\n"+bodyclass.bodyst;
		do
		{
		bodyclass b=new bodyclass();
		
		int ch2;
		b.headarticle();
		System.out.println("Enter your choice:\n1. Text\n2. Images\n3. Links\n4. End article\n");
			ch2=sc.nextInt();
		do{
			switch(ch2)
			{
				case 1:b.article_text();
				break;
				case 2:b.article_image();
				break;
				case 3:b.article_links();
				break;
				default:System.out.println("Invalid choice.Enter again\n");
			}
			System.out.println("Enter your choice:\n1. Text\n2. Images\n3. Links\n4. End article\n");
			ch2=sc.nextInt();
		}while(ch2!=4);
		b.closearticle();
		bst+=bodyclass.bodyst;
		System.out.println("Would you like to create a new article?\n1. Yes\n2. No\n");
		ch1=sc.nextInt();
	}while(ch1!=2);
	//System.out.println("BODYST With carousel\n"+bst);
	//Footer class being called
	//Footer class being called
	footerclass c=new footerclass();
	int flagform;
	int flagcontactdetails;
	System.out.println("Would you like a form to be included?\n1. Yes\n2. No\n");
	flagform=sc.nextInt();
	if(flagform==1)
		c.form();
	System.out.println("Would you like your contact details to be included?\n1. Yes\n2. No\n");
	flagcontactdetails=sc.nextInt();
	if(flagcontactdetails==1)
		c.contactdetails();
	System.out.println("Please enter the details for your footer");
	c.endfooter();
	c.end();
	//System.out.println("HEADSTR\n"+headclass.headstr);
	//System.out.println("BODYST\n"+bst);
	//System.out.println("FOOTSTR\n"+footerclass.footstr);
	String finals=headclass.headstr+bst+footerclass.footstr;
	return finals;
}
}



class demo extends headclass
{
	static Scanner sc=new Scanner(System.in);
	static String str;
	public static void main(String args[])
	{
		//String str="<!doctype html>\n<html>\n<head>\n<title>hello</title>\n <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n<body>\n<p>I hope this works gggxgdgxdg</p>\n</body>\n</html>";
		 gettingstr ob=new gettingstr();
		 str=ob.run();
		 //System.out.println(str);
		 try{  
            File f =new File(headclass.re+".html");
            f.createNewFile();
			OutputStream f1 = new FileOutputStream(f);
                System.out.println("New File is created!");
                f1.write(str.getBytes());
                 
        } catch (IOException e) {  
            e.printStackTrace(); 
        }  
	}
}
