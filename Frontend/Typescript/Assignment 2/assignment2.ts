let k:string[]=[];
k.push("Nagul");
k.splice(0,0,"Virat","Stark");
k.push("Ethan","Hunt");
k.splice(4,0,"Tony");

console.log(k.join(" : "));

for(let i=0;i<k.length;i++)
{
    console.log("index :"+i+" - Name :"+k[i]);
}