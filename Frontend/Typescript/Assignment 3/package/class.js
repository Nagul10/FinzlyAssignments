"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MyClass = void 0;
var MyClass = /** @class */ (function () {
    function MyClass() {
    }
    MyClass.prototype.world = function () {
        console.log("World");
    };
    MyClass.prototype.hello = function () {
        console.log("Hello");
    };
    return MyClass;
}());
exports.MyClass = MyClass;
