# Java-Swing-Practice

This is the command list of Anisul Islam's [Java Swing Playist](https://youtube.com/playlist?list=PLgH5QX0i9K3rAHKr6IteF5kdgN6BorH9l)  

## Content: 

### T1 : Course Plan

### T2 : Run java program from command line

1. Write your code  
2. Open command line in the same directory as the code file
3. Compile your code by, `javac <fielname.java>`
4. Run your code by, `java <filename>`

### T3-T7 : Dialog Window

- `JOptionPane.showMessageDialog(Component parentComponent, Object message);`  
   if `parentComponent = null` the dialog box will show at the middle of the screen  
   **message** : can be a string  
- `JOptionPane.showMessageDialog(Component parentComponent, Object message, String title, int messageType);`  
   **title** : The title for the dialog box  
   **messageType** : Defines the style of the message. The Look and Feel manager may lay out the dialog differently depending on this value, and will often provide a default icon. The possible values are:  
  - ERROR_MESSAGE  
  - INFORMATION_MESSAGE  
  - WARNING_MESSAGE  
  - QUESTION_MESSAGE  
  - PLAIN_MESSAGE  
- 
