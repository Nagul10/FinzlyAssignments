"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Class2 = void 0;
var class1_1 = require("./class1");
var Class2 = /** @class */ (function (_super) {
    __extends(Class2, _super);
    function Class2() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Class2.prototype.class2Method = function () {
        console.log("class 2 method");
    };
    return Class2;
}(class1_1.Class1));
exports.Class2 = Class2;
