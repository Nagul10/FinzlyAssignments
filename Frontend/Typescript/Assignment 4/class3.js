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
exports.Class3 = void 0;
var class2_1 = require("./class2");
var Class3 = /** @class */ (function (_super) {
    __extends(Class3, _super);
    function Class3() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Class3.prototype.class3Method = function () {
        console.log("class 3 method");
    };
    return Class3;
}(class2_1.Class2));
exports.Class3 = Class3;
