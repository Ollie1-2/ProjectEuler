import java.util.Arrays;
public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
int sundays =0;
int jan=0; 
int feb=0;
int mar=0;
int apr=0;
int may=0;
int jun=0;
int jul=0;
int aug=0;
int sep=0;
int oct=0;
int nov=0;
int dec=0;
int numberofdays=36500+24;
int[][] months = new int[366][100];
int z=0;


for(int year=1901; year<2001; year++){
	if(year%4==0){
		for(x=1; x<=31; x++){if(jan<31){
			jan++;
			months[jan-1][z]=jan;
		}}


			for(x=1; x<=29; x++){if(feb<29){
			feb++;
			months[jan+feb-1][z]=feb;
		}}

		for(x=1; x<=31; x++){if(mar<31){
			mar++;
			months[jan+feb+mar-1][z]=mar;
		}}

		for(x=1; x<=30; x++){if(apr<30){
			apr++;
			months[jan+feb+mar+apr-1][z]=apr;
		}}

		for(x=1; x<=31; x++){if(may<31){
			may++;
			months[jan+feb+mar+apr+may-1][z]=may;
		}}

		for(x=1; x<=30; x++){if(jun<30){
			jun++;
			months[jan+feb+mar+apr+may+jun-1][z]=jun;
		}}

		for(x=1; x<=31; x++){if(jul<31){
			jul++;
			months[jan+feb+mar+apr+may+jun+jul-1][z]=jul;
		}}

		for(x=1; x<=31; x++){if(aug<31){
			aug++;
			months[jan+feb+mar+apr+may+jun+jul+aug-1][z]=aug;
		}}

		for(x=1; x<=30; x++){if(sep<30){
			sep++;
			months[jan+feb+mar+apr+may+jun+jul+aug+sep-1][z]=sep;
		}}

		for(x=1; x<=31; x++){if(oct<31){
			oct++;
			months[jan+feb+mar+apr+may+jun+jul+aug+sep+oct-1][z]=oct;
		}}

		for(x=1; x<=30; x++){if(nov<30){
			nov++;
			months[jan+feb+mar+apr+may+jun+jul+aug+sep+oct+nov-1][z]=nov;
		}}

		for(x=1; x<=31; x++){if(dec<31){
			dec++;
			months[jan+feb+mar+apr+may+jun+jul+aug+sep+oct+nov+dec-1][z]=dec;
		}}

}else{ 

			for(x=1; x<=31; x++){if(jan<31){
				jan++;
				months[jan-1][z]=jan;
			}}


			for(x=1; x<=28; x++){if(feb<28){
				feb++;
				months[jan+feb-1][z]=feb;
			}}

			for(x=1; x<=31; x++){if(mar<31){
				mar++;
				months[jan+feb+mar-1][z]=mar;
			}}

			for(x=1; x<=30; x++){if(apr<30){
				apr++;
				months[jan+feb+mar+apr-1][z]=apr;
			}}

			for(x=1; x<=31; x++){if(may<31){
				may++;
				months[jan+feb+mar+apr+may-1][z]=may;
			}}

			for(x=1; x<=30; x++){if(jun<30){
				jun++;
				months[jan+feb+mar+apr+may+jun-1][z]=jun;
			}}

			for(x=1; x<=31; x++){if(jul<31){
				jul++;
				months[jan+feb+mar+apr+may+jun+jul-1][z]=jul;
			}}

			for(x=1; x<=31; x++){if(aug<31){
				aug++;
				months[jan+feb+mar+apr+may+jun+jul+aug-1][z]=aug;
			}}

			for(x=1; x<=30; x++){if(sep<30){
				sep++;
				months[jan+feb+mar+apr+may+jun+jul+aug+sep-1][z]=sep;
			}}

			for(x=1; x<=31; x++){if(oct<31){
				oct++;
				months[jan+feb+mar+apr+may+jun+jul+aug+sep+oct-1][z]=oct;
			}}

			for(x=1; x<=30; x++){if(nov<30){
				nov++;
				months[jan+feb+mar+apr+may+jun+jul+aug+sep+oct+nov-1][z]=nov;
			}}

			for(x=1; x<=31; x++){if(dec<31){
				dec++;
				months[jan+feb+mar+apr+may+jun+jul+aug+sep+oct+nov+dec-1][z]=dec;
			}}

		}
			z++; jan=0;feb=0;mar=0;apr=0;may=0;jun=0;jul=0;aug=0;sep=0;oct=0;nov=0;dec=0;
		}

//for(int i=0;i<366;i++){
  //  for(int j=0;j<100;j++) {
    //    System.out.print(months[i][j]+" ");
    //}
    //System.out.println("");
//}

int dayofweek=1;
int[][] weeks=new int[366][100];
x=0;
z=0;

for(int year=1901; year<2001;year++){		
if(year%4==0){
	for(x=0;x<=365;x++){
		if (dayofweek<7){
				dayofweek++;
				weeks[x][z]=dayofweek;
		}else{
				dayofweek=1;
				weeks[x][z]=dayofweek;}
	}}else{

	for(x=0;x<=364;x++){
		if (dayofweek<7){
				dayofweek++;
		weeks[x][z]=dayofweek;
	}else{
			dayofweek=1;
			weeks[x][z]=dayofweek;}}
}z++;
}

//for(int i=0;i<366;i++){
 //   for(int j=0;j<100;j++) {
  //     System.out.print(weeks[i][j]+" ");
  //  }
   // System.out.println("");
//}
for(int i=0;i<365;i++){
   for(int j=0;j<100;j++) {
		if(weeks[i][j]==1 && months[i][j]==1){
			sundays++;
		}else{}
	}}
System.out.println(sundays-1);
}}


