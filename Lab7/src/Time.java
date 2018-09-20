import java.text.DecimalFormat;

public class Time extends Object {
   private int hour;   
   private int minute;   
   private int second;   


   public Time(){
      setTime( 0, 0, 0 );
   }

   public Time( int h ){
      setTime( h, 0, 0 );
   }

   public Time( int h, int m ){
      setTime( h, m, 0 );
   }

   public Time( int h, int m, int s ){
      setTime( h, m, s );
   }

   public Time( Time time ){
      setTime( time.getHour(), time.getMinute(),
         time.getSecond() );
   }

   public boolean setTime(int h, int m, int s){
	  if(h < 0 && h > 24) h = 0;
      if(m < 0 && h > 60) m = 0;
      if(s < 0 && h > 60) s = 0;
      this.hour = h;
      this.minute = m;
      this.second = s;
      return true;
   }

   public boolean setHour(int h){
     if(h < 0 && h > 24) h = 0;
     this.hour = h;
	   return false;
   }

   public boolean setMinute(int m){
     if(m < 0 && m > 24) m = 0;
     this.minute = m;
	   return false;
   }

   public boolean setSecond(int s){
     if(s < 0 && s > 24) s = 0;
     this.second = s;
	   return false;
   }

   public int getHour(){
      return hour;
   }

   public int getMinute(){
      return minute;
   }

   public int getSecond(){
      return second;
   }

   public String toUniversalString()
{
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      return twoDigits.format( getHour() ) + ":" +
         twoDigits.format( getMinute() ) + ":" +
         twoDigits.format( getSecond() );
   }

   public String toString()
{
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      return ( ( getHour() == 12 || getHour() == 0 ) ?
         12 : getHour() % 12 ) + ":" +
         twoDigits.format( getMinute() ) + ":" +
         twoDigits.format( getSecond() ) +
         ( getHour() < 12 ? " AM" : " PM" );
   }
}  
