// Text-Processing API Url
const API_URL = 'http://localhost:8082/text/analyze';

// Button click handler
const onAnalyzeButtonClick = () => {
  // Getting a textarea element with a comment
  const commentElement = document.getElementById('comment');
  // Getting comment text
  const commentText = commentElement.value.trim();

  // Handle empty comment
  if (!commentText) {
          return handleEmptyComment();
  }
  // Calling the API and passing the result with the displayResult as a callback function
  return analyzeComment(commentText, displayResult);
};

const analyzeComment = (comment, callback) => {
  // Creating an object to send to the server
  // const data = {
  //         text: comment,
  //         language: 'english'
  // };

  const formattedData = {
    "content": comment
  };

  const otherParams = {
    headers:{
      "Content-Type": "application/json",
      "Accept-Charset": "utf-8"
    },
    body: JSON.stringify(formattedData),
    method:"POST"
  };
  console.log(JSON.stringify(formattedData));
  fetch(API_URL,otherParams)
  .then((response) => response.json())
  .then((result) => {console.log('Success: ',result);localStorage.setItem("text-analyzer-result",JSON.stringify(result));displayResult()})
  .catch((error) => {console.log(error)});
};

const handleEmptyComment = () => {
  const resultBlockElement = document.getElementById('main-result-block');
  resultBlockElement.classList.add('invisible');
  return alert('Add text to analyze!');
};

const displayResult = () => {
  // Remove invisible class for main-result-block
  const resultBlockElement = document.getElementById('main-result-block');
  resultBlockElement.classList.remove('invisible');
  const result = JSON.parse(localStorage.getItem("text-analyzer-result"));
  
  console.log(result,result.word_count)
  // Setting the color of the result text depending on the response label
  const label = resultBlockElement.label;
  const resultElement = document.getElementById('result');
  resultElement.setAttribute('class', label);

  const row1 = document.getElementById('word-count');
  row1.textContent = result["word_count"];

  const row2 = document.getElementById('total-char-count');
  row2.textContent = result["character_count_without_space"]

  const row3 = document.getElementById('char-count');
  row3.textContent = result["character_count_with_spaces"]

  const row4 = document.getElementById('line-count');
  row4.textContent = result["line_count"]

  const row5 = document.getElementById('unique-words');
  row5.textContent = result["unique_words"]

};
