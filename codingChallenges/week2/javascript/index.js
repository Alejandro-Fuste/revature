const colorPatternTimes = (array) => {
  // initialize variables for counter and color time
  let [colorTime, switchTime] = [array.length * 2, 0];

  // loop to get number of color changes
  for (i = 1; i < array.length; i++) {
    if (array[i - 1] !== array[i] && array.length > 1) switchTime++;
  }

  // return switches + color time
  return switchTime + colorTime;
};

console.log(colorPatternTimes(["Blue"])); // -> 2
console.log(colorPatternTimes(["Red", "Yellow", "Green", "Blue"])); // -> 11
console.log(colorPatternTimes(["Blue", "Blue", "Blue", "Red", "Red", "Red"])); // -> 13
