/* ----- Question 1 ----- */

const getHashTags = (string) => {
  // variable to hold hashtag words
  let hashtagWords = [];

  // split string and sort by length descending
  let sortedWords = string
    .toLowerCase()
    .split(" ")
    .sort((a, b) => b.length - a.length);

  for (i = 0; i < 3; i++) {
    if (sortedWords[i] === undefined) {
      break;
    } else {
      hashtagWords.push(`#${sortedWords[i]}`);
    }
  }

  return hashtagWords;
};

console.log(
  getHashTags("How the Avocado Became the Fruit of the Global Trade")
); // ["#avocado", "#became", "#global"]

console.log(
  getHashTags(
    "Why You Will Probably Pay More for Your Christmas Tree This Year"
  )
); // ["#christmas", "#probably", "#will"]

console.log(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")); // ["#surprise", "#parents", "#fruit"]

console.log(getHashTags("Visualizing Science")); // ["#visualizing", "#science"]
