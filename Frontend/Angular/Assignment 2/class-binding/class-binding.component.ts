import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-class-binding',
  templateUrl: './class-binding.component.html',
  styleUrls: ['./class-binding.component.css']
})
export class ClassBindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  isClicked: boolean = false;

  toggleStyle() {
    this.isClicked = !this.isClicked;
  }

  sendData(text: any) {
    alert("You typed " + text)
  }
  primeMessage: string = ""

  //isPrimeOrNot(num: any) {
  //   let number = num as number;
  //   for (let i = 1; i < number/2; i++) {
  //     for (let j = 1; j < i; j++) {
  //       if (i % j != 0) {
  //         this.primeMessage = "Not a prime number";
  //         return;
  //       }
  //     }
  //   }
  //   this.primeMessage = "Prime Number";
  // }
  isPrimeOrNot(num: any) {
    let number = num as number;
    let isPrime = true;
    for (let i = 2; i <= Math.sqrt(number); i++) {
      if (number % i === 0) {
        isPrime = false;
        break;
      } else {
        isPrime = true;
      }
    }
    if (isPrime) {
      this.primeMessage = "Prime number";
    } else {
      this.primeMessage = "Not a Prime Number"
    }

  }
}
